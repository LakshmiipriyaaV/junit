package junit;

 class MyclassAddTest {
 void Addtest() {
	 MyJunitClass junit=new MyJunitClass();
	 int result=junit.add(1000, 200);
	 assertEquals(300,result);
	 
 }

private void assertEquals(int i, int result) {
	// TODO Auto-generated method stub
	
}
}
