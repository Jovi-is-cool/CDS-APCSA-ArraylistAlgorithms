import java.util.ArrayList;

public class Cities
{
   private ArrayList<City> cityList;
  
  public Cities(String[] names, int[]pop)
  {
     //complete the contructor code here
   cityList = new ArrayList<City>();
     for(int i = 0; i < names.length; i ++){
         cityList.add(new City(names[i], pop[i]));
     }
  }

  public void insertCity(String name, int pop)
  {
    //complete the code for this method here
    cityList.add(0, new City(name, pop));
  }

  public void deleteCity(String name)
  {
    //complete the code here
    for(int i = 0; i < cityList.size(); i ++){
      if(cityList.get(i).getName() == name){
         cityList.remove(i);
         i--;
      }
    }
  }

 
  public ArrayList<String> visitedCities()
  {
   ArrayList<String> visitList = new ArrayList<String>();  
   for(int i = 0; i < cityList.size(); i++){
      if(cityList.get(i).getTourism() == true)
      visitList.add(cityList.get(i).getName());
   }
   return visitList;  
  }

  public String toString()
  {
     String output = "LIST OF CITIES\n\n";
     for(City c : cityList)
     {
        output += c;
     }
     return output;
     
  }
}