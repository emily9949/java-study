package com.sumin.chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Application1 {

    static int N;
    static int[] parent;
    static boolean[] visited;
    static StringTokenizer st;
    static List<Integer>[] list; // List 배열 선언
    static StringBuilder sb = new StringBuilder();


    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        sb.delete(0, sb.length()); // 알고리즘과는 무관하지만 테스트 코드 환경이라 앞선 내용 삭제

        N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        list = new ArrayList[N + 1];
        parent = new int[N + 1];

        /* 설명. 각각의 노드 (인덱스 번호와 일치) 들이 Arraylist 를 하나씩 가지도록 초기화 */
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        /* 설명. N-1개 중에 걸쳐서 각 노드들 정보 입력 */
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
        }

        dfs(1);

        // 1번은 부모니까 2번 노드부터 확인해서 StringBuilder에 누적
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]);
            sb.append(" ");
        }

        return sb.toString();
    }

    private static void dfs(int i) {
        visited[i] = true;

        for (int node: list[i]) { // ArrayList도 for-each로 접근할 수 있다
            if(!visited[node]) {
                parent[node] = i;
                dfs(node);
            }
        }
    }
}
