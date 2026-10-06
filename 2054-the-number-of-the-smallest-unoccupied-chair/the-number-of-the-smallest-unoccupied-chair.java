class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<times.length;i++){
            pq.add(i);
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<times.length;i++){
            map.put(times[i][0],i);
        }
        PriorityQueue<Integer> arrivals= new PriorityQueue<>(map.keySet());
        PriorityQueue<int[]> occupied = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );
        while(!arrivals.isEmpty()){
            int arrival=arrivals.poll();
            int friend=map.get(arrival);
            while (!occupied.isEmpty() && occupied.peek()[0] <= arrival) {
                pq.add(occupied.poll()[1]);
            }
            int chair = pq.poll();

            if (friend == targetFriend) {
                return chair;
            }

            occupied.add(new int[]{times[friend][1], chair});
        }
        return -1;
    }
}