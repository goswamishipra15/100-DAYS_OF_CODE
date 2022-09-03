Problem Statement URL: https://leetcode.com/problems/watering-plants/ 

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int capacityCan = capacity;
        int steps = 0;
        int backSteps, forwardSteps;
        for(int i=0;i<plants.length;i++){
            if(plants[i] <= capacityCan){
                capacityCan -= plants[i];
                steps +=1;
            }
            else{
                backSteps = i;
                forwardSteps = backSteps + 1;
                steps += backSteps + forwardSteps;
                capacityCan = capacity - plants[i];
            }
        }
        return steps;
        
    }
}
