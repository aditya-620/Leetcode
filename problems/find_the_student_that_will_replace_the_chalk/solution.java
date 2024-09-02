class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalchalk = 0;
        for(int usechalk : chalk){
            totalchalk += usechalk; 
        }
        int remchalk = (int)(k % totalchalk);

        for(int i=0; i<chalk.length; i++){
            if(remchalk < chalk[i]){
                return i;
            }
            remchalk -= chalk[i];
        }
        return 0;
    }
}