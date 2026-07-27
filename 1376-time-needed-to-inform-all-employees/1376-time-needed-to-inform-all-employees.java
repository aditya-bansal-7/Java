class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1)
                graph.get(manager[i]).add(i);
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{headID, 0});

        int ans = 0;

        while (!q.isEmpty()) {

            int[] cur = q.poll();

            int emp = cur[0];
            int time = cur[1];

            ans = Math.max(ans, time);

            for (int child : graph.get(emp)) {
                q.offer(new int[]{child, time + informTime[emp]});
            }
        }

        return ans;
    }
}