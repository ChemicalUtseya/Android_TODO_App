package project.android_todo_app.stores;

import project.android_todo_app.actions.Action;
import project.android_todo_app.dispatcher.Dispatcher;

/**
 * Created by Lanka Naveen on 06/04/16.
 */
public abstract class Store {

    final Dispatcher dispatcher;

    protected Store(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    void emitStoreChange() {
        dispatcher.emitChange(changeEvent());
    }

    abstract StoreChangeEvent changeEvent();
    public abstract void onAction(Action action);

    public interface StoreChangeEvent {}
}
