package works;


//公鸡五元一只，母鸡三元一只，小鸡一元三只，现在有100元，要买100只鸡，列出可能的方案
public class chick{
	public static void main(String[] args){
		int count=0;
		for(int i=0;i<=20;i++){
			for(int j=0;j<34;j++){
				for(int k=0;k<300;k=k+3){
					if((i+j+k==100)&&(i*5+j*3+k/3==100)){
						System.out.println(i+" 只母鸡   "+j+" 只公鸡   "+k+"只小鸡");
						count++;
					}
				}
			}
		}
		System.out.println("共有"+count+"种方法");
	}

}
