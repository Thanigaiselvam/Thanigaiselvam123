public class WeatherForecast1 
{

public static void main(String[] args)
{


double[] weeklyTemperatures = {25.5, 26.0, 24.5, 23.0, 22.5, 27.0,

28.5};
 
int startIndex = 3; 
int endIndex = 6; 

double sum = 0.0;
for (int i = startIndex; i<= endIndex; i++) 
{

sum=sum+weeklyTemperatures[i];
}
double averageTemperature = sum/(endIndex-startIndex + 1);


System.out.println
("Average temperature from Wednesday to

Saturday:"+averageTemperature);
}

}