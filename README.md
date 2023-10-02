# leetcode
一个专门用来刷leetcode的仓库
以前的leetcode记录已丢失o(╥﹏╥)o
<h1>目录</h1>

31:<a href="#31"> 下一个排列 </a> m  
32:<a href="#32"> 最长有效括号 </a> m  
35:<a href="#35"> 搜索插入位置 </a> e  
42:<a href="#42"> 取水</a> h  
55:<a href="#55"> 跳跃游戏 </a> m  
54:<a href="#54"> 螺旋矩阵 </a> m  
59:<a href="#59"> 螺旋矩阵2 </a> m  
62:<a href="#62"> 不同路径 </a> m  
69:<a href="#69"> x的平方根 </a> e  
73:<a href="#73"> 矩阵置0 </a> m  
77:<a href="#77"> 组合 </a> m  
91:<a href="#91"> 解码方法 </a> m  
118:<a href="#118"> 杨辉三角 </a> e  
119:<a href="#119"> 杨辉三角II </a> e  
120:<a href="#120"> 三角形最短路径 </a> m  
122:<a href="#122"> 买卖股票的最佳时机2 </a> m  
136:<a href="#136"> 只出现一次得数 </a> e  
146:<a href="#146"> LRUCache </a> m  
160:<a href="#160"> LFUCache </a> h  
206:<a href="#206"> 课程表 </a>m  
209:<a href="#209"> 长度最小的子数组 </a>m  
605:<a href="#605"> 种花问题 </a> e  
2582:<a href="#2582"> 枕头传递 </a> e



<h2 id="31"> 31: 下一个排列 </h2>

难度:中等  
思路:  
如果该排列呈现出倒序,则是最大的排列了.否则不是,只需把更大的数提到前面即可.  
**找一个尽可能小的比它大的排列**  
从后向前便利,寻找a[i]<a[i+1];则只更改i~len-1的部分,前面不动(**尽可能小**)  
i+1到len-1都是逆序的,所以后面已经是最大的了,只能将后面比num[i]大的最小数与num[i]交换位置,然后后面的序列**仍为逆序**,倒置得到最小的序列即可.



<h2 id="32"> 32: 最长有效括号 </h2>

难度:困难  
思路:  
维护栈中保留一个最近的无法匹配的')'的下标.
- 当pop后为空时,说明将最近的一个')'弹出了,无法匹配,所以压入当前位置,当前位置即最近的无法匹配的')'
- 当pop不为空,说明弹出的肯定不是')',是'(',所以匹配上了,这时候可以计算长度i-peek()
- 起始状态时压入-1模拟最近的无法匹配的下标


<h2 id="35">35:搜多插入位置</h2>
难度:简单
<h3>要求:</h3>
时间复杂度logn
<h3>思路:</h3>
那就不能顺序查找,二分查找即可.理清二分查找在落入最后两项的情景下的情景即可

二分查找的注意点:
- 当中间有值与之相等时,会搜到,直接返回
- 当中间无值与之相等时,最后会落入仅a,b两项的局面
  - 若a,b均非首尾值,则目标值在其之间
  - 若a是首值,则目标值可能等于小于a
  - 若b是尾部值,则目标值可能大于等于b
  - 本来原队列就只有两个数



<h2 id="42"> 42: 取水 </h2>
难度:困难



<h2 id="54"> 54: 螺旋矩阵 </h2>

难度:中等  
思路:  
从外到内剥开矩阵,每一次剥记录left,top,right,bottom.然后依次取出上右下左的元素  
注意点:  
当right=left时,就不取出right的元素  
当bottom=top时,就不取出bottom的元素



<h2 id="55">55: 跳跃游戏 </h2>

难度:中等  
思路:  
逆向思维.不断记录能跳到终点的最小下标位置
只要中间不会中断,可以到0即可.
~~~
public boolean canJump(int[] nums) {
        //最小下标位置初始化为len-1,即最后一位
        int canIdx=nums.length-1;
        
        for (int idx = nums.length-2; idx >=0 ; --idx) {
            //如果当前位置能到达,最小下标位置;则最小下标位置更新
            if(idx+nums[idx]>= canIdx){
                canIdx=idx;
            }
            //如果当前位置不能到达则继续向左边遍历即可
        }
        return canIdx==0;
}
~~~




<h2 id="59"> 59: 螺旋矩阵 2 </h2>

难度:中等  
思路:  
54题按层模拟的思想依然可行



<h2 id="62"> 62: 不同路径 </h2>

难度:中等
<h3>思路:</h3>
- f(m,n)=f(m-1,n)+f(m,n-1)  
这里使用递归,是会出现重复的计算的.所以要使用"备忘录"将一些已经计算过的进行存储
- 上面方法的变式.逆向思维
- 需要向右m-1步,向下n-1步.共m+n-2步,就是在这m+n-2步中确定向下的n-1步即可(排列组合)
注意要先除小的数



<h2 id="69">69:x的平方根</h2>
难度:简单
<h3>要求:</h3>
x范围是0~2^31-1
<h3>思路:</h3>
本题ac不难.主要是如何ac得更优雅
- 从0开始遍历.i*i=x时返回i,i\*i>x时返回i-1  
**当x=2^31-1时,最后i\*i绝对会溢出**考虑用除法
- 当x/i=i时返回i,x/i<i时返回i-1;规避了乘积溢出的情况.但要注意别让除数为0
- 别信楼上,为啥遍历,不如用**2分查找**
- 牛顿迭代法(结合数学)



<h2 id="73"> 73:  矩阵置0 </h2>

难度:中等  
思路:第一遍,用两个set记录一下那些行/列有0,第二遍置0



<h2 id="77"> 77:  组合 </h2>

难度:中等  
思路:  
要深刻体会dfs,  
要选择ArrayList,而不是LinkedList,因为经常要使用list的size  



<h2 id="91"> 91:  解码方法 </h2>

难度:中等  
思路:  
当s.charAt(i)不为0,f(i)+=f(i-1);即在原本的组合上新加上第i位独自组成的码  
i-1,i组成的数<26时
- 当s.charAt(i-1)为0时,不变(第i-1位和第i位无法组成一个码)
- 当i-1位不为0时,且i-1位和i位组成的数<=26时,f(i)+=f(i-2)(第i-1位和第i位可以组成一个码)



<h2 id="118">118: 杨辉三角 </h2>
难度:简单
<h3>思路:</h3>
for循环即可



<h2 id="119">119: 杨辉三角II </h2>
难度:简单
<h3>思路:</h3>
for循环即可.但是注意如果rowNumber
- 奇数,则有偶数个数,只需记录num/2个数就可以
- 偶数,则有奇数个数,只需记录num/2+1个数就可以

最后返回的时候再扩展成为完整的一行  
for循环的过程中也不需要记录每一行,记录上一行就可以


<h2 id="120">120: 三角形中的最短路径 </h2>
难度:中等
<h3>思路:</h3>
不要从上往下递归,会重复计算.  
逆向思维,从下往上计算,同时记录一下就可以.




<h2 id="122">122: 买卖股票的最佳时机2 </h2>
难度:中等
<h3>思路:</h3>
最下跌到上升,买;从上升到下跌,卖  
注意点:  
第一天买不买的逻辑,最后一天卖不卖的逻辑  
**遇到价格没变的情况**:如果遇到价格没变,保留左边的趋势;即好像跳过一样
~~~
      last=next==0?last:next;
~~~



<h2 id="136">136:只出现一次的数</h2>
难度:简单
<h3>思路:</h3>
1. 用一个hashSet,遍历并在set中查,查到则删除,没查到则放入.最后set中只剩一个值
2. 异或算法,全部异或起来



<h2 id="146">146:LRU缓存</h2>
难度:中等
<h3>要求:</h3>
get和put时间复杂度都是O(1)
<h3>思路:</h3>
- get时间复杂度为O(1):用hashmap即可,key是key,我们需要的value在Map的value中
- put时间复杂度O(1):用hashMap去remove时间较久,添加时间也较久.  
  使用双向链表:(因此map中的value是节点)
  - remove时,直接remove最后面的.(用一个虚拟tail即可马上搜到),同时要在map中删除,所以由节点能得到key
  - insert时,直接插到最前面(用一个虚拟head即可),
  
~~~java
private class MapNode{
        int key;
        int value;
        MapNode prev;
        MapNode next;
        public MapNode() {}
        public MapNode(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private HashMap<Integer,MapNode> linkedMap;
    private MapNode head;
    private MapNode tail;
    private int capacity;
    private int size;
~~~



<h2 id="160">160: LFUCache</h2>
难度:困难
<h3>要求:</h3>
时间复杂度:get和put的时间复杂度都是O(1)
<h3>思路:</h3>
回顾146题:LRUCache,使用了hashmap+双向链表.  
1. 如果这里继续使用hashmap+双向链表,问题出在:链表的维护,在use某个node后,node如何移动,移到哪里(这个过程会改变时间复杂度)
而LRUCache中只需要将node无脑上移一位即可.  
**因此问题在于:如何将存在重复值的一系列值有序排列**使用**平衡二叉树**  
这样的时间复杂度是O(log n),瓶颈在于平衡二叉树的插入与删除
2. 使用两个hashmap



<h2 id="206">206: 课程表 </h2>
难度:中等 
<h3>思路:</h3>
这是一个有向图,即是确定图中会不会出现环.(即可不可以形成拓扑排序)
用一个int[] visited去保存每一个节点的状态(未搜索,搜索中,已搜索)
dfs中,取一个未搜索节点,进行搜索,对每一个节点,设其状态为搜索中,去访问它的每一个邻近节点,
- 若临近节点状态为搜索中,发现环,无法形成拓扑排序
- 若临近节点状态已搜索,无操作,继续即可.
- 若临近节点状态为未搜索,则搜索该节点
当所有邻近节点搜索完成后,将该节点状态设为一搜索.返回上一级



<h2 id="209">209: 长度最小的子数组 </h2>
难度:中等
<h3>要求:</h3>
时间复杂度n.
<h3>思路:</h3>
滑动窗口.右边向前不断扩大sum,一旦sum到了target,左边向前缩小sum,产生一次len,与上一次len比较.  
注意点:   
与上一次len比较,不能直接返回min(len,right-left+1).因为len初始值为0,导致min会一直为0.



<h2 id="605">605: 种花问题 </h2>
难度:简单  
思路:  
滑动窗口,最左边是第一个0,最右边是第一个1;看这个len(len=2,n=1;len=3,n=2;len=4,n=2;len=5,n=3
可得规律是n=(len+1)/2)
注意点:当滑动窗口是从第一个数开始时,要将len+1;当滑动窗口最后一个是最后一个数,也要将len+1;(临界情况)


<h2 id="2582">2582: 枕头传递 </h2>
难度:简单  
思路:  
一定要先取余数,将前面的重复传递过程略去