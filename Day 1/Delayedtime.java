class Delayedtime {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
      int rt = arrivalTime+delayedTime;
      if(rt == 24)
      return 0;
      else if (rt>24)
      return rt-24;
      else 
      return rt;  
    }
}