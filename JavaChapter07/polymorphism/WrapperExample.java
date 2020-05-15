package polymorphism;
//래퍼 객체
public class WrapperExample {

	public static void main(String[] args) {

		Object[] arrObj = new Object[10];
		
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)32767);
		arrObj[2] = new Integer(2147483647);
		arrObj[3] = new Long(2136484836482L);
		arrObj[4] = new Float(3.5F);
		arrObj[5] = new Double(3.7);
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('J');
		arrObj[8] = new String("Hello Java");
		arrObj[9] = new java.util.Date();
		
		for(int i=0; i<arrObj.length; i++)
			System.out.println(arrObj[i]);
	}

}
