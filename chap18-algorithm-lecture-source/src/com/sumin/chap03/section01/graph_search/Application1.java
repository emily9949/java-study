package com.sumin.chap03.section01.graph_search;

import java.io.*;
import java.util.StringTokenizer;

public class Application1 {

    static int[][] map;
    static boolean[] visit; // 방문 배열
    static int count = 0;
    static int node, edge; // node 와 edge 의 개념을 저장

    /* 설명. 문자열에서 한 줄 씩 읽어들이기 위한 BufferedReader를 반환하는 메소드(readLine())*/
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        /* 설명. 노드와 간선에 대한 정보가 담긴 map (node의 갯수와 번호에 기반한 int형 2차원 배열) */
        map = new int[node + 1][node + 1]; // 0번 인덱스는 쓰지 않고 인덱스 번호와 노드 번호 일치를 위해

        /* 설명. 방문 배열 (지나갔던 노드를 다시 방문하지 않기 위함, 재귀 호출의 stackoverflow를 방지하기 위함) */
        visit = new boolean[node+1]; // 방문 배열도 노드 번호와 인덱스 번호 일치

        /* 설명. 인접리스트에 그래프 정보 작성 */
        for (int i = 0; i < edge; i++) {
//          StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st = new StringTokenizer(br.readLine()); // " " 가 delimeter 이면 생략 가능

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 1번 노드는 1번 인덱스에 넣으면 된다
//            map[a][b] = 1;
//            map[b][a] = 1;

            /* 설명. 무방향(양방향) 그래프로 처리되기 위해 노드 번호(인덱스 번호)를 반대로도 적용한다. */
            map[a][b] = map[b][a] = 1;


        }

        /* 설명. map 에 그래프 정보가 입력된 것 확인 */
//        for (int i = 0; i < node + 1; i++) {
//            for (int j = 0; j < node + 1; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

        dfs(1);

        return count -1 ; // 1번 컴퓨터를 통해 오염된 수

    }

    /* 설명. 재귀함수로 dfs 알고리즘을 구현할 메소드 */
    private static void dfs(int start) {
        visit[start] = true;
        count++;

        for (int i = 1; i <= node; i++) {
            if (map[start][i] == 1 && !visit[i]) {
                dfs(i); // 다 찍고 다시 돌아오는 재귀함수
            }
        }
    }
}
