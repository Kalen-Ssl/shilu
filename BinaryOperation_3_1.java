package test;



import java.util.Random;

public class BinaryOperation_3_1 {

    static final int UPPER = 100;  //加法约束：最大值
    static final int LOWER = 0;    // 减法约束：最小值
    private int left_operand = 0;  // 算式的左操作数
    private int right_operand = 0; // 算式的右操作数
    private char operator = '+';   // 算式的操作符
    private int value;             // 算式的计算结果

    /**
     * 构造一个算式
     * @param left： 左操作数
     * @param right ： 右操作数
     * @param op： 操作符
     */
    private void construct(int left, int right, char op) {
        this.left_operand = left;
        this.right_operand = right;
        this.operator = op;
        if(op == '+') {
            value = left + right;
        }else {
            value = left - right;
        }
    }

    /**
     * 产生一个加法算式，约束是操作数和结果都不大于UPPER
     * @return BinaryOperation_3_1对象（算式对象）
     */
    public BinaryOperation_3_1 generateAdditionOperation() {
        int left, right, result;
        Random random = new Random();
        do {
            left = random.nextInt(UPPER+1);
            right = random.nextInt(UPPER+1);
            result = left + right;
        }while(result > UPPER);
        BinaryOperation_3_1 bop = new BinaryOperation_3_1();
        bop.construct(left, right, '+');
        return bop;
    }

    /**
     * 产生一个减法算式，约束是操作数不大于UPPER，结果不小于LOWER
     * @return BinaryOperation_3_1对象（算式对象）
     */
    public BinaryOperation_3_1 generateSubstrctOperation() {
        int left, right, result;
        Random random = new Random();
        do {
            left = random.nextInt(UPPER+1);
            right = random.nextInt(UPPER+1);
            result = left - right;
        }while(result < LOWER);
        BinaryOperation_3_1 bop = new BinaryOperation_3_1();
        bop.construct(left, right, '-');
        return bop;
    }

    /**
     * 产生一个加法或者减法算式
     * @return BinaryOperation_3_1对象（算式对象）
     */
    public BinaryOperation_3_1 generateBinaryOperation() {
        Random random = new Random();
        int opValue = random.nextInt(2);
        if(opValue == 0) {  // 产生一个加法算式
            return generateAdditionOperation();
        }else {  // 产生一个减法算式
            return generateSubstrctOperation();
        }
    }

    /**
     *  获取左操作数
     * @return 获取值
     */
    public int getLeftOperand() {
        return left_operand;
    }

    /**
     *  获取右操作数
     * @return 获取值
     */
    public int getRightOperand() {
        return right_operand;
    }

    /**
     *  获取操作符
     * @return 获取值
     */
    public char getOperator() {
        return operator;
    }

    /**
     *  获取计算结果
     * @return 获取值
     */
    public int getValue() {
        return value;
    }

    /**
     * 判断算式是否相等
     * @param anOperation： 待比较的算式
     * @return 如果算式相等，返回true；否则返回false
     */
    public boolean equals(BinaryOperation_3_1 anOperation) {
        return left_operand == anOperation.getLeftOperand() &&
                right_operand == anOperation.getRightOperand() &&
                operator == anOperation.getOperator();
    }

    /**
     * 返回算式字符串： a+b 或者 a-b
     */
    public String toString() {
        String str;
        str = String.format("%3d %c %3d ", left_operand, operator, right_operand);
        return str;
    }

    /**
     * 返回算式字符串： a+b= 或者 a-b=
     */
    public String asString() {
        return toString() + " = ";
    }

    /**
     * 返回算式字符串： a+b=c 或者 a-b=c
     */
    public String fullString() {
        return toString() + " = " + getValue();
    }

}
