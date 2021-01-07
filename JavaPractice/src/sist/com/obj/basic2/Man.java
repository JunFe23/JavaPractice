package sist.com.obj.basic2;
//이름, 나이, 오늘생일, 성별, 지역, 전화번호, 띠,
public class Man {
    private String name;
    private int age;
    private String birth;
    private String gender;
    private String location;
    private String tel;
    private String ddi;
    
    
    
    
   public Man() {
      
   }
   public Man(String name, int age, String birth, String gender, String location, String tel, String ddi) {
      
      this.name = name;
      this.age = age;
      this.birth = birth;
      this.gender = gender;
      this.location = location;
      this.tel = tel;
      this.ddi = ddi;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getBirth() {
      return birth;
   }
   public void setBirth(String birth) {
      this.birth = birth;
   }
   public String getGender() {
      return gender;
   }
   public void setGender(String gender) {
      this.gender = gender;
   }
   public String getLocation() {
      return location;
   }
   public void setLocation(String location) {
      this.location = location;
   }
   public String getTel() {
      return tel;
   }
   public void setTel(String tel) {
      this.tel = tel;
   }
   public String getDdi() {
      return ddi;
   }
   public void setDdi(String ddi) {
      this.ddi = ddi;
   }
   @Override
   public String toString() {
      return "Man [name=" + name + ", age=" + age + ", birth=" + birth + ", gender=" + gender + ", location="
            + location + ", tel=" + tel + ", ddi=" + ddi + "]";
   }
    
    
    
    
}