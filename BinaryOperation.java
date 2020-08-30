package fuxi2;

import java.util.Random;

/**
 * 算式类BinaryOperation，抽象父类，封装算式通用的属性和方法
 * @author lenovo
 *
 */
public abstract class BinaryOperation {

    static final int UPPER = 100; //加法约束
    static final int LOWER = 0;   //减法约束
    private int left_operand = 0;  // 左操作数
    private int right_operand = 0;  // 右操作数
    private char operator;          // 操作符
    private int  value;             // 算式的结果

    abstract int calculate(int left, int right);  //抽象方法：算式的计算，由子类实现
    abstract boolean checkingCalculation(int anInteger); // 抽象方法，检验计算结果，子类负责实现

    protected void generateBinaryOperation(char anOperator) {
        int left, right, result;
        Random random = new Random();
        do {
            left = random.nextInt(UPPER+1);   //产生左操作数
            right = random.nextInt(UPPER+1);   //产生右操作数
            result = calculate(left, right);
        }while(!checkingCalculation(result));
        left_operand = left;
        right_operand = right;
        operator = anOperator;
        value = result;
    }

    /**
     * 获取左操作数
     * @return 获取值
     */
    public int getLefOperand() {
        return left_operand;
    }

    /**
     * 获取右操作数
     * @return 获取值
     */
    public int getRightOperand() {
        return right_operand;
    }

    /**
     * 获取操作符
     * @return 获取值
     */
    public char getOperator() {
        return operator;
    }

    /**
     * 获取计算结果
     * @return 获取值
     */
    public int getResult() {
        return value;
    }

    /**
     * 判断两个算式是否相等
     * @param anOperation：输入待比较算式
     * @return 和当前算式比较，如果相等则返回1；如果不相等返回0
     */
    public boolean equals(BinaryOperation anOperation) {
        return left_operand == anOperation.getLefOperand() &&
                right_operand == anOperation.getRightOperand() &&
                operator == anOperation.getOperator();
    }

    /**
     * @return 返回a+b 或者 a-b
     */
    public String toString() {
        String str;
        str = String.format("%3d %c %3d ", left_operand, getOperator(), right_operand);

        return str;
    }

    /**
     * @return 返回a+b= 或者 a-b=
     */
    public String asString() {
        return toString() + " = ";
    }

    /**
     * @return 返回a+b=c 或者 a-b=c
     */
    public String fullString() {
        return toString() + " = " + getResult();
    }

    /**
     * 构造算式，注意：只有当参数满足要求才能调用。
     * @param left：左操作数
     * @param right：右操作数
     * @param anOperation：操作符
     */
    public void unsafeConstructor(int left, int right, char anOperation) {
        this.left_operand = left;
        this.right_operand = right;
        this.operator = anOperation;
        this.value = anOperation == '+' ? left+right : left - right;
    }

    /**
     * 构造算式，注意：只有当参数满足要求才能调用。
     * @param left：左操作数
     * @param right：右操作数
     * @param result:算式的结果
     * @param anOperation：操作符
     */
    public void unsafeConstructor(int left, int right, int result, char anOperation) {
        this.left_operand = left;
        this.right_operand = right;
        this.operator = anOperation;
        this.value = result;
    }

    /**
     * 构造算式，注意：只有当参数满足要求才能调用。目前字符串格式支持 a+b 或者 a-b两种输入格式
     * @param eqString：输入的算式字符串
     */
    public void unsafeConstructor(String eqString) {
        int opPos = 0; //运算符的位置
        int length = eqString.length();  // 获得算式的长度
        // 从字符串中找到运算符所在位置，'+'或者'-'
        opPos = eqString.indexOf("+"); //找到“+”所在位置
        if(opPos <= 0) {
            opPos = eqString.indexOf("-"); //找到“-”所在位置
        }
        unsafeConstructor(Integer.parseInt(eqString.substring(0,opPos)),
                Integer.parseInt(eqString.substring(opPos+1,length)),
                eqString.charAt(opPos));
    }

}
