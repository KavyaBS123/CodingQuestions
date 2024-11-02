class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
      
        int n=players.length;
        int m=trainers.length;
Arrays.sort(players);
Arrays.sort(trainers);
int l=0;
int r=0;
while(l<m && r<n){
    if(players[r]<=trainers[l]){
        r++;
    }
    l++;
}
return r;

    }
}
   