/*
Zuzanna Ciborowska
Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć, 
numer indeksu, rozmiar stopy. 
Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale, getFeetSize,
 getIndexNumber. Stwórz także odpowiednie metody set. 
Stwórz przykładowy obiekt zwierający Twoje dane. 
*/
public class Human {
    private int age;
    private float weight;
    private float height;
    private string name;
    private string gender;
    private string indexNumber;
    private int feetSize;
    

    public Human(int age, float weight, float height, string name, string gender, string indexNumber, int feetSize) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.gender = gender;
        this.indexNumber = indexNumber;
        this.feetSize = name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public string getName() {
        return name;
    }

    public string getGender() {
        return gender;
    }

    public string GetindexNumber() {
        return indexNumber;
    }

    public int GetfeetSize() {
        return feetSize;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(string gender) {
        this.gender = gender;
    }

    public string setIndexNumber(string indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setFeetSize(int feetSize) {
        this.feetSize = feetSize;
    }


    public static void main(String[] args) {
        Human Zuzia = new Human(21, 55, 160, "Zuza", "female", "s20682", 38);
    }

}
