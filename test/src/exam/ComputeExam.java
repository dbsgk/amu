package exam;

class ComputeExam{
	public static void main(String[] args){
 		System.out.println("백의 자리 = "+ String.format("%d",(576/100)));
		System.out.println("십의 자리 = "+ String.format("%d",((576%100)/10)));
		System.out.println("일의 자리 = "+ String.format("%1d",(576%10)));
 }
}