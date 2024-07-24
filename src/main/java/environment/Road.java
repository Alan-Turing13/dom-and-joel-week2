package environment;

import animals.Flyable;
import animals.Swimmable;
import vehicle.Vehicle;

public class Road extends Environment<Object>{
    @Override
    public void checkTraffic() {
        for (Object obj : traffic){
            if (obj instanceof Vehicle && !(obj instanceof Flyable)) {
                ((Vehicle) obj).move();
            } else {
                System.out.println(obj.getClass().getSimpleName() + " is on the road NOOOO!");
            }
        }
    }
}
