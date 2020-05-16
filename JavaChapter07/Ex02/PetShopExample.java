package Ex02;

public class PetShopExample {

	public static void main(String[] args) {
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal tiger = new Tiger();
		Animal[] animals = new Animal[3];
		animals[0] = baduk;
		animals[1] = nabi;
		animals[2] = tiger;
		for(Animal anim : animals) {
			anim.eat();
		}
		
		System.out.println();
		IPet[] pets = new IPet[3];
		pets[0] = (IPet)baduk;
		pets[1] = (IPet)nabi;
		pets[2] = new GoldFish();
		
		for(IPet pet : pets) {
			pet.play();
		}
		
		System.out.println();
		PetShop shop = new PetShop();
		shop.carePet((IPet)baduk);//IPet 타입으로형변환 해서 전달해야 함
		shop.carePet((Cat)nabi);//Cat은 IPet이므로 Cat으로 형변환 해도 됨
		shop.carePet(pets[2]);//pets 배열은 IPet 타입
		//Tiger t = new Tiger();
		//shop.carePet(t); //Compile Error Tiger는 IPet을 상속받지 않았기 때문
	}

}
