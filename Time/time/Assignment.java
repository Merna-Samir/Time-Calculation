package time;

public class Assignment {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hours : minutes : seconds ");
		
		Time t1  = new Time (7 ,28 , 48);
		System.out.println (" " +t1.gethours() + " : " + t1.getminutes() + " : " + t1.getseconds()) ;
		
		Time t2  = new Time (6 ,36 , 38);
		System.out.println (" " +t2.gethours() + " : " + t2.getminutes() + " : " + t2.getseconds()) ;
		
		Time t3 =  new Time ();
		t3.AddTime(t1, t2); }
}
