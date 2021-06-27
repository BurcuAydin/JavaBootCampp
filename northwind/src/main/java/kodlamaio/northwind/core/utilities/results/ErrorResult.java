package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result{
	//Mesaj vermek istemiyor
		public ErrorResult() {
			super(false);
		}
		public ErrorResult(String message) {
				super(false,message);
			}
}
