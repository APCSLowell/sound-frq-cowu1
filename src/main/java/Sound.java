import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    int num = 0;
    for (int i -0; i<samples.length; i++)
      {
        if (samples[i]< -limit)
        {
          samples[i] = -limit;
          num++;
        }
      else if (samples[i]>limit)
      {
        samples[i] = limit;
        num++;
      }
    }
    
    return num;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    int c=0;
   while (samples[c] == 0){
     c++;
  }
  int[] result = new int[samples.length-c)
  int ri = 0;
  for (int k = c; k<samples.length; k++){

    result[ri]= samples[k];
    ri++;
  }
  samples = result;
}
}
