import java.util.*;

public class TwoFiveOneTwo_solution {
    public  List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        if(k==0){
            return new ArrayList<>();
        }

       List<GradesOfStu> gradesOfStus = new ArrayList<>(student_id.length);

        //计算每个学生的分数
        HashSet<String> positive_words = new HashSet<>();
        for(String word:positive_feedback){
            positive_words.add(word);
        }

        HashSet<String> negative_words =new HashSet<>();
        for(String word:negative_feedback){
            negative_words.add(word);
        }

        for(int i=0;i< report.length;++i){
            GradesOfStu gradesOfStu = new GradesOfStu();
            int grade =0;
            String[] sentences_words = report[i].split(" ");
            for(String word:sentences_words){
                if(positive_words.contains(word)){
                    grade+=3;
                }else if(negative_words.contains(word)){
                    grade-=1;
                }
            }
            gradesOfStu.grade=grade;
            gradesOfStu.id=student_id[i];
            gradesOfStus.add(gradesOfStu);
        }

        //进行堆排
        //初始化大小为k的堆
        PriorityQueue<GradesOfStu> student_index = new PriorityQueue<>(
                new Comparator<GradesOfStu>() {
                    @Override
                    public int compare(GradesOfStu o1, GradesOfStu o2) {
                        return o1.grade==o2.grade?o2.id-o1.id:o1.grade-o2.grade;
                    }
                }
        );
        for(int i=0;i<k;++i){
            student_index.add(gradesOfStus.get(i));
        }

        //不断比较并加入其他student_id
        for(int i=k;i< student_id.length;++i){
            if(gradesOfStus.get(i).compare(student_index.peek())){
                student_index.poll();
                student_index.add(gradesOfStus.get(i));
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<k;++i){
            result.add(student_index.poll().id);
        }
        Collections.reverse(result);
        return result;
    }

    private class GradesOfStu{
        int grade;
        int id;

        public boolean compare( GradesOfStu gradesOfStu) {
            return (this.grade==gradesOfStu.grade?gradesOfStu.id-this.id:this.grade-gradesOfStu.grade)>0;
        }
    }

}
