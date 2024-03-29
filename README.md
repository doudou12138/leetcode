# leetcode
一个专门用来刷leetcode的仓库
以前的leetcode记录已丢失o(╥﹏╥)o
<h1>目录</h1>

31:<a href="#31"> 下一个排列 </a> m  
32:<a href="#32"> 最长有效括号 </a> m  
35:<a href="#35"> 搜索插入位置 </a> e  
42:<a href="#42"> 取水</a> h  
45:<a href="#45"> 跳跃游戏2</a> m  
53:<a href="#53"> 最大子数组和 </a> m  
54:<a href="#54"> 螺旋矩阵 </a> m  
55:<a href="#55"> 跳跃游戏 </a> m  
56:<a href="#56"> 合并区间 </a> m  
59:<a href="#59"> 螺旋矩阵2 </a> m  
62:<a href="#62"> 不同路径 </a> m  
64:<a href="#64"> 最小路径和 </a> m  
69:<a href="#69"> x的平方根 </a> e  
73:<a href="#73"> 矩阵置0 </a> m  
77:<a href="#77"> 组合 </a> m  
82:<a href="#82"> 删除序列列表中重复节点 </a> m  
91:<a href="#91"> 解码方法 </a> m  
96:<a href="#96"> 不同的二叉搜索树 </a> m  
98:<a href="#98"> 检验二叉搜索树 </a> m  
99:<a href="#99"> 恢复二叉搜索树 </a> m  
118:<a href="#118"> 杨辉三角 </a> e  
119:<a href="#119"> 杨辉三角II </a> e  
120:<a href="#120"> 三角形最短路径 </a> m  
122:<a href="#122"> 买卖股票的最佳时机2 </a> m  
123:<a href="#123"> 买卖股票的最佳时机3 </a> h   
136:<a href="#136"> 只出现一次得数 </a> e  
146:<a href="#146"> LRUCache </a> m  
200:<a href="#200"> 岛屿数量 </a>m  
206:<a href="#206"> 课程表 </a>m  
209:<a href="#209"> 长度最小的子数组 </a>m  
210:<a href="#210"> 课程表2 </a>m  
274:<a href="#274"> H指数 </a>m  
318:<a href="#318"> 最大单词长度乘积 </a> m  
460:<a href="#460"> LFUCache </a> h  
605:<a href="#605"> 种花问题 </a> e  
695:<a href="#695"> 最大的岛屿面积 </a> m  
1155:<a href="#1155"> 掷骰子等于目标和的方案数</a> m  
1402<a href="#1402"> 做菜顺序 </a> h  
1488:<a href="#1488"> 避免洪水泛滥 </a> m  
1726:<a href="#1726"> 同积元组 </a> m   
2304:<a href="#2304"> 网络中的最小路径代价 </a> m   
2316:<a href="#2316"> 统计无向图中无法互相到达点对数 </a> m   
2512:<a href="#2512"> 最优秀的k位同学 </a> m  
2530:<a href="#2530"> 执行k次操作后的最大分数</a> m  
2558:<a href="#2558"> 从数量最多的堆中取走礼物</a> e  
2562:<a href="#2562"> 找到数组的串联值 </a> e  
2578:<a href="#2578"> 最小和分割 </a> e  
2582:<a href="#2582"> 枕头传递 </a> e  
2652:<a href="#2652"> 倍数求和 </a> e  
2760:<a href="#2760"> 最长奇偶子序列 </a> e  
100042:<a href="#100042">和为目标值的最长子序列的长度 </a> m  
100097:<a href="#100097">合法组数的最小组数 </a> m  
100104:<a href="#100104">使二进制字符变美丽的最小修改数 </a> m  
100133:<a href="#100133">购买水果所需的最小金币数 </a> m  
LRU:
159:<a href="#LRU159"> 库存管理III </a> e


<h2 id="31"> 31: 下一个排列 </h2>
难度:中等  
思路:  
如果该排列呈现出倒序,则是最大的排列了.否则不是,只需把更大的数提到前面即可.  
**找一个尽可能小的比它大的排列**  
从后向前便利,寻找a[i]< a[i+1];则只更改i~len-1的部分,前面不动(**尽可能小**)  
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



<h2 id="45"> 45: 跳跃游戏2 </h2>

难度:中等  
思路: 
1. 时间复杂度O(n^2),从后往前规约,第i位到终点需要多少步;  
第i位到终点最少需要 Min(nums[i+1],nums[i+2]....nums[i+nums[i]])+1步
2. 时间复杂度O(n),贪心算法加动态规划:
![图解](https://github.com/doudou12138/img/blob/925ea3a41bf63218866365f31f91e173ba4a01dd/leetcode/45GreedyAlgorithm.png?raw=true)



<h2 id="53"> 53: 最大子数组和 </h2>

难度:中等  
思路:
滑动窗口.  




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



<h2 id="56"> 56: 合并区间 </h2>

难度:中等  
思路:  
首先要对区间根据左边界排序,这样能够合并的区间必然是连续的.  
遍历有序区间同时维护一个区间,若遍历区间与维护区间有重复,则合并,重新确定右边界;  
若遍历区间与维护区间不重复,则维护区间加入结果,维护当前遍历区间.  

记得遍历结束把最后一个维护区间也加入.  



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



<h2 id="64"> 64: 最小路径和 </h2>

难度:中等
<h3>思路:</h3>
回溯.  
f(m,n)=Math.min(f(m+1,n),f(m,n+1))+grid[m][n];




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



<h2 id="82"> 82:  删除排序列表中重复元素 </h2>

难度:中等  
思路:        
滑动窗口思路可解  


<h2 id="91"> 91:  解码方法 </h2>

难度:中等  
思路:  
当s.charAt(i)不为0,f(i)+=f(i-1);即在原本的组合上新加上第i位独自组成的码  
i-1,i组成的数<26时
- 当s.charAt(i-1)为0时,不变(第i-1位和第i位无法组成一个码)
- 当i-1位不为0时,且i-1位和i位组成的数<=26时,f(i)+=f(i-2)(第i-1位和第i位可以组成一个码)



<h2 id="96"> 96:  不同的二叉搜索树 </h2>

难度:中等  
思路:  
以n个节点1~n能组成的二叉搜索树的个数.  
f(i,j)+=f(i,j-1)  
f(i,j)+=f(i+1,j)  
f(i,j)+=f(i,k-1)*f(k+1,j)   i<k<j   

提高效率:  
在f(i,j)算出之前,算出f(i,m),f(m,j);
```
for(int j=0;j<n;++j){
    for(int i=j-1;j>=0;--j){
        ...    
    }
}
```


<h2 id="98"> 98:  验证二叉搜索树 </h2>

难度:中等  
思路:  
新建一个boolean check(TreeNode root,int max,int min);  
对于每一个节点的检验,都有上下界.  
易错点:左节点只有上界,右节点只有下界.  (a的左节点b可能也在c的右边(当a在c右边时),因此左节点也有下界)



<h2 id="99"> 99:  恢复二叉搜索树 </h2>

难度:中等  
思路:  
如何检测二叉搜索树中出现了错误.**中序遍历**  
正常的二叉搜索树,左节点<父节点<右节点.那么其中序遍历应该是单调递增的.  
因此中序遍历并根据遍历结果,找到那两个点破坏了单调性:两种情况:  
- 两个连续点调换:
 1 2 3 4 6 8 11 9 13 14
  将11和9调换即可  
- 两个调换的点中间有其他节点:
  1 2 4 6 7 13 9 10 8 15 17
  13-9 10-8两个地方破坏了单调性,将第一队的前节点和第二对的后节点调换  



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




<h2 id="121">121: 买卖股票的最佳时机 </h2>
难度:中等
<h3>思路:</h3>
最下跌到上升,买;从上升到下跌,卖  
注意点:  
第一天买不买的逻辑,最后一天卖不卖的逻辑  
**遇到价格没变的情况**:如果遇到价格没变,保留左边的趋势;即好像跳过一样
~~~
      last=next==0?last:next;
~~~



<h2 id="122">122: 买卖股票的最佳时机2 </h2>
难度:中等
<h3>思路:</h3>
只能进行两次操作.   
错误思路:找出两个最大的单调递增区间  
举例:
~~~
1,2,4,2,5,6,4,9
两个最大的单调递增区间是2~6:4,4~9:5
但其实正确做法是1~6,4~9
~~~

正确思路:  
状态转移.四个状态buy1,sell1,buy2,sell2;
向后遍历:
~~~
buy1=max{buy1,-price[i]}
sell1=max{sell1,buy1+price[i]}
buy2=max{buy2,sell1-price[i]}
sell2=max{sell2,buy2+price[i]}
~~~

<h2 id="130">130:被围绕的区域</h2>
难度:中等
<h3>思路:</h3>
首先分析,如果那块没有和边缘连起来,则是被围绕了.如果能成功和边缘相连,则没被围绕.
所以从边缘开始分析:
1. 遍历边缘节点,如果为'O',进入下一步
2. 检查与该边缘节点相邻的内部节点(就不检查与之相邻的边缘节点了,因为会遍历边缘节点),如果为'O',进入下一步,否则返回第一步继续遍历
3. 检查该节点是否被检查过(为了防止重复检查节点,使用一个二维数组表示节点是否被检查过),未检查过,进入下一步
4. 如果该内部节点为'O',则检查与之相邻的内部节点(这里做一个判断,既可以防止越界,也可以防止重复检查边缘节点);进入第三步


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
  
~~~
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




<h2 id="200">200: 岛屿数量 </h2>
难度:中等
<h3>思路:</h3>
dfs+洪水泛滥(实际上洪水泛滥就是有一种dfs)  
遍历表格,如果发现是岛屿,则count+1,并淹没岛屿.(使用dfs淹没(把陆地改为海))  
最后返回count即可.



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



<h2 id="210">210: 课程表2 </h2>
难度:中等
<h3>思路:</h3>
基本思路与<a href="#206">206</a>相似,使用一个数组记录访问状态,dfs;  
不同点:
- 要返回学习顺序,实在该节点所有子节点搜索完后加入(即所有先修(直接或间接)课学完再添加该课)



<h2 id="274">274: H指数 </h2>
难度:中等
<h3>思路:</h3>
堆排序,每次取出最大的引用数link,同时记录着当前论文数num;当link<num使,返回结果  



<h2 id="318">318: 最大单词长度乘积 </h2>
难度:中等
<h3>思路:</h3>
难点:  
如何快速判断两个单词是否有重复字符:  
遍历字符,转化为数字: 对于字符串的每一个字符都进行位运算即: num |= 1<<ch-'a'  将26个字符是否存在,转为数字的哪一位上为1.
通过两字符的掩码 num1&num2==1判断有无重复字母.  
优化:  
记录下,每个掩码对应的最大长度.(在多个数字具有相同掩码时,省去了多余工作)  


<h2 id="460">460: LFUCache</h2>
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




<h2 id="605">605: 种花问题 </h2>
难度:简单  
思路:  
滑动窗口,最左边是第一个0,最右边是第一个1;看这个len(len=2,n=1;len=3,n=2;len=4,n=2;len=5,n=3
可得规律是n=(len+1)/2)
注意点:当滑动窗口是从第一个数开始时,要将len+1;当滑动窗口最后一个是最后一个数,也要将len+1;(临界情况)


<h2 id="695">695:最大的岛屿面积 </h2>
难度:中等  
思路:  
洪水泛滥算法,只是泛滥的时候还要记得统计面积.  




<h2 id="1155"> 1155:掷骰子等于目标和的方案数</h2>

难度:中等  
思路:  
dp+背包问题(任意选1~k放入被背包中,要求和为定值target,数量为n(全部放),问方案数)  
dp[j]是当前和为j的方案数  
dp[j]=dp[j-1]+dp[j-2]+...+dp[j-k]/dp[0] (等号右边都是上一个状态的(即筛子数减一时的方案数),所以要**逆序遍历**,即先更新dp[m],在更新dp[n],m>n)  
[背包问题:](https://blog.csdn.net/aninstein/article/details/108061603)

<h2 id="1402">1402:做菜顺序 </h2>
难度:困难    
思路:  
1. 排序
Arrays.sort(sati);
2. 如果加入也一定是优先加最大的,按序遍历,并判断是否加上当前最大的(加上这个最大的,result增加就加上)
即贪心: 加上当前最大的肯定是放到最先做,假设为x;已经放入的和为sum;加入x后,
3. sum对应的每个菜时间都加1导致result+sum.result总共增加:sum+x.(sum+x<0就结束,返回)


<h2 id="1488">1488:避免洪水泛滥 </h2>
难度:中等    
思路:  
对于晴天的日子,使用**TreeSet**记录日子,以备检测到两次下雨时应用    
对于下雨的日子,使用HashMap记录下标(日子)和湖泊编号  
当发现已经记录了该湖泊时则需要找到一个在第二次下雨前(有排序需求,所以用treeSet)的晴天抽水  



<h2 id="1726">1726:同积元组 </h2>
难度:中等   
思路:  
找到元组(a,b,c,d),b*c=a*d.  **HashMap+动态规划**  
使用HashMap表示能达成的积  
遍历nums,对每个数,再遍历其前面的数,相乘得积s,去HashMap中get
- 如果为null,说明前面还没有两个数乘积为s
- 如果不为null,为x,说明前面有x个数对(b,c),b\*c=x;那么就新增元组x\*8个.



<h2 id="2304">2304:网格中的最小路径代价 </h2>
难度:中等    
思路:  
感觉是最小路径和的变式.动态规划的思想不变.  

f(m,n):到m层n下标元素的最小路径和  
f(m,n) = min (f(m-1,i)+move_price[grid[m-1][i]][n]) i属于0~wid  



<h2 id="2316">2316:统计无向图中无法互相到达点个数 </h2>
难度:中等    
思路:  
1. 并查集:(适用于图中的连通性问题(分区域))  
  UnionFind类需自己实现:  
  使用一个数组就可以,当然可以相关功能去添加一些成员变量以提高速度
   (注意做好路径压缩)
  ~~~java
  class UnionFind(){
    int[] pres;
    
    public UnionFind(int cap){
        pres=new int[cap];
        for(int i=0;i<cap;++i){
            pres[i]=i;
        }
    }
    
    public int find(int i){
        if(pres[i]==i){
            return i;
        }
        //路径压缩
        pres[i]=find(pres[i]);
        /*
                不压缩
                return find(pres[i]);
         */
        return pres[i];
    }
    
    public void join(int x,int y){
        int fx=find(x);
        int fy=find(y);
        pres[fx]=fy;
    }
    
}
  ~~~

2. 深度优先搜索



<h2 id="2512">2512:最优秀的k位同学 </h2>
难度:中等    
思路:  
哈希表(计算得分)+堆排(topk问题)



<h2 id="2530">2530:执行k次操作后的最大分数 </h2>
难度:中等    
思路:  
贪心(每次取最大的)(优先队列实现)  
细节:
优先队列的添加优先使用offer(e),add(e)调的还是offer(e)
~~~
public boolean add(E e) {
    return offer(e);
}
~~~
实现ceil m/n:  即大于或等于m/n的最小整数
对于整数型 m/n,默认是得到小于或等于m/n的最大整数.
~~~
public int ceil(m,n){
  return (m+n-1)/n;
}
~~~


<h2 id="2558">2558:从最大的堆中取走礼物 </h2>

难度:简单  
思路:  
用**优先队列**记录一下最大堆即可,快速存取.  

 

<h2 id="2562">2562:找到数组的串联值 </h2>
难度:简单  
思路:  
双指针,判断奇偶情况



<h2 id="2578">2578:最小和分割 </h2>
难度:简单  
思路:  
要重新排列后的两数和最小,那么应该分成位数均匀地两数(即使和的位数也尽量少);本质上是为每一个位的数字赋予基础值(1,10,100...)且每个基础值只能被赋两次,
为两个大的数字赋予同一小的基础值(即 将两个大数字放到较低的位数).
因此将数字排列,并根据排列结果赋予基础值求和.  
注意点:  
- 得到数字排列时,
  ~~~
  long i=1;
  for(;i<=num;i*=10);
  i/=10;
  ~~~
  这段代码应该注意i溢出的问题,使用long


<h2 id="2582">2582: 枕头传递 </h2>
难度:简单  
思路:  
一定要先取余数,将前面的重复传递过程略去


<h2 id="2652">2652: 倍数求和</h2> 

难度:简单  
思路:  
容斥原理.f(n,3)+f(n,5)+f(n,7)-f(n,15)-f(n,21)-f(n,35)+f(n,105)  
f(n,m):1~n能被m整除的数:是一个等差数列 第一项:m,最后一项m*(n/m),



<h2 id="2760">2760: 最长奇偶子序列 </h2>

难度:简单  
思路:  
滑动窗口,left和right;  
位运算快速判断  



<h2 id="100042">100042: 和为目标值的最长子序列的长度</h2>

难度:中等  
思路:背包问题  
每个值取1/0次,和为定值,最多取多少个值  
dp[i][j]:从0~i中取子序列和为j的最长长度



<h2 id="100097">100097: 合法分组的最小组数</h2>

难度:中等  
思路:  
先遍历一遍,使用HashMap记录每个数出现的次数.  
找到最小次数min.  
从min+1开始往1遍历i,判断i,i-1能够作为组中人数来分组,如果可以,计算分出的组数.  
>这里注意不能用二分法,因为可能不能以数量x,x-1分组,但是可能能以x+m,x+m-1为组数
> 例:有4个1,5个2;
> 不能用3,4,但是能用4,5



<h2 id="100104">100104: 将字符串变美丽的最小修改数</h2>

难度:中等  
思路:  
贪心  



<h2 id="100133">100133: 购买水果所需的最小金币数</h2>

难度:中等  
思路:  
dp,背包变式  
状态转移方程:    
dp[i]表示出钱购买第i个水果,并且得到后面的所有水果所需的最小金币数  
dp[i] = prices[i] + min(dp[i+1],dp[i+2].......dp[2*i],dp[2*i+1])  





<h1>LRU题库</h1>
<h2 id="LRU159">159 库存问题III </h2>
 
难度:简单  
思路:  
这是一个经典的TOPk问题,即找出最大/小的k个对象  
- 最简易的做法:int[]->IntStream->sorted->limit(k)(取流的前k个数)->toArray()
- 使用堆.java中即使用优先队列(PriorityQueue).用优先队列去维护k个数,而不是n个.
- 快排

>优先队列:继承了队列的性质,  
>特殊点:  
>普通队列严格FIFO,但是优先队列可以让out有优先级
> 实现:使用堆(堆通常可以认为是完全二叉树的数组表示)