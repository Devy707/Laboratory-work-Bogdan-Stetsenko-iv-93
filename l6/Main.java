public class Main {
    //C13 = 9329 % 13 = 8
    /*Визначити ієрархію літаків. Створити авіакомпанію. Порахувати загальну місткість і
    вантажопідйомність авіакомпанії. Провести сортування літаків компанії за дальністю польоту.
    Знайти літак у компанії, що відповідає заданому діапазону споживання пального.*/
    public static void main(String[] args) {
        AviaCompany aviaCompany = new AviaCompany();
        aviaCompany.plus(new Maria(23,100,9000));
        aviaCompany.plus(new Vurib(40,150,2000));
        aviaCompany.plus(new Maria(100,550,500));
        aviaCompany.sortByDalnist();
        System.out.println(aviaCompany.getMistkistMe());
        System.out.println(aviaCompany.getVantazhMe());

    }
}