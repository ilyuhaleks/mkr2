package mkr2;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private List<Observer> observers = new ArrayList<>();
    private String status;
    private int progress;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers("Стан змінено на: " + status);
    }

    public void setProgress(int progress) {
        this.progress = progress;
        notifyObservers("Прогрес оновлоено до: " + progress + "%");
    }

    private void notifyObservers(String taskStatus) {
        for (Observer observer : observers) {
            observer.update(taskStatus);
        }
    }

    public String getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }
}

