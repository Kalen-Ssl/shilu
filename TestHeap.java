package work;



public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    /**
     *
     * @param root 每棵子树根节点
     * @param len  每棵子树的结束位置
     */
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        //最起码有左子树
        while (child < len) {
            //1、(child+1 < len)  证明有右孩子的 --》 找到左右孩子的最大值
            if( (child+1 < len) && this.elem[child] < this.elem[child+1]) {
                child++;//child保存的是左右孩子最大值的下标
            }
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;//为什么他还要指向孩子  因为 无法确定是否此树调整完毕
                child = 2*parent+1;
            }else {
                break; //不需要进行调整了
            }
        }
    }


    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i  代表每棵子树的根节点
        for (int i = (this.usedSize-1-1)/2; i >= 0 ; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }




}
