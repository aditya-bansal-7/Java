class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 1; i <= n; i++){
            map.put(i,new ArrayList<>());
        }

        for(int i[] : dislikes){
            map.get(i[0]).add(i[1]);
            map.get(i[1]).add(i[0]);
        }

        int[] colors = new int[n + 1];

        Arrays.fill(colors, -1);

        for(int i = 1; i <= n; i++){
            if(colors[i] != -1){
                continue;
            }

            colors[i] = 0;

            Queue<Integer> q = new LinkedList<>();
            q.add(i);

            while(!q.isEmpty()){
                int cur = q.poll();

                for(int k: map.get(cur)){
                    if(colors[k] == -1){
                        colors[k] = 1- colors[cur];
                        q.add(k);
                    }else if (colors[k] == colors[cur]){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}