package com.ISP;

public interface IWorker extends IFeedable, IWorkable{

}
interface IWorkable {
	public void work();
}

interface IFeedable{
	public void eat();
}

class Worker implements IWorkable, IFeedable{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
	
	class RobotEmployees implements IWorkable{
		public void work() {
			// ....working
		}
	}
	
	class SuperWorker implements IWorkable, IFeedable{
		public void work() {
			//.... working much more
		}

		public void eat() {
			//.... eating in launch break
		}
	}

	class Manager {
		IWorker worker;

		public void setWorker(IWorker w) {
			worker=w;
		}

		public void manage() {
			worker.work();
		}
	}
}

