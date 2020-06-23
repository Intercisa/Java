package reactiveextensioneventbroker;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

public class EventBroker extends Observable<Integer> {

	private List<Observer<? super Integer>> observers = new ArrayList<Observer<? super Integer>>();
	
	@Override
	protected void subscribeActual(@NonNull Observer<? super @NonNull Integer> observer) {
		observers.add(observer);
		
	}
	
	public void publish(int n) {
		for(Observer<? super Integer> o : observers)
			o.onNext(n);
	}
	

}
