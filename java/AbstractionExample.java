
// Abstract class

public abstract class Phone {
	public abstract void call();
	public abstract void useCamera();
}

------------------------------------------------------------------

// Samsung class which extends Phone

public class Samsung extends Phone{
	void call() {
		System.out.println("Samsung call");
	}

	void useCamera() {
		System.out.println("Take picture with Samsung");
	}
}

------------------------------------------------------------------

// Iphone class which extends Phone

public class Iphone extends Phone{
	void call() {
		System.out.println("Iphone call");
	}

	void useCamera() {
		System.out.println("Take picture with Iphone");
	}
}

------------------------------------------------------------------

// How the abstract class becomes useful

public class RepairShop {

	// you can pass either Iphone or Samsung object, if the abstract class wasn't there,
	// two methods would need to be made one for iphone and one for samsung
	void repair(Phone phone) {
		/
	}
}