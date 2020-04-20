package Chapter04;
/*label : 반복문{
 *		반복문 {
 *				break label;
 *		}
 *}
 *
 *label : 반복문{
 *		반복문 {
 *				continue label;
 *		}
 *}
*/
public class LabeledLoopExample {

	public static void main(String[] args) {
		outer: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 2) {
					break outer;
				}
				System.out.println(i + "\t" + j);
			}
		}
	}

}
