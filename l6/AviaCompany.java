import java.util.*;

public class AviaCompany {
    private static int m = 5;
    private Plane[] aviaCompanyComponents = new Plane[m];
    private int p;

    public void plus(Plane plane){
        aviaCompanyComponents[p++] = plane;
    }

    @Override
    public String toString() {
        return "AviaCompany{" +
                "aviaCompanyComponents=" + Arrays.toString(aviaCompanyComponents) +
                ", p=" + p +
                '}';
    }
    public int getMistkistMe(){
        int result = 0;
        for(Plane plane: aviaCompanyComponents){
            if(plane != null){
                result += plane.getMistkist();
            }
        }
        return result;
    }
    public int getVantazhMe(){
        int result1 = 0;
        for(Plane plane: aviaCompanyComponents){
            if(plane != null){
                result1 += plane.getVantash();
            }
        }
        return result1;
    }
    public void sortByDalnist(){
        List<Plane> planeList =new ArrayList<>();
        for(Plane aviaCompanyComponent : aviaCompanyComponents){
            if(aviaCompanyComponent != null){
                planeList.add(aviaCompanyComponent);
            }
        }
        planeList.sort(Comparator.comparing(Plane::getDal_polit));
        System.out.println(planeList);
    }
}
