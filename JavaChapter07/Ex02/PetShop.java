package Ex02;

public class PetShop {
	public void carePet(IPet pet) {
		if(pet instanceof Dog) {
			System.out.println("개를 돌봅니다.");
		}else if(pet instanceof Cat) {
			System.out.println("고양이를 돌봅니다.");
		}else if(pet instanceof GoldFish) {
			System.out.println("물고기를 돌봅니다.");
		}
	}
}
