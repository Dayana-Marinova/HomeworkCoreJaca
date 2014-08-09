package hackbulgariaThread;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinimalPoint {

	public MinimalPoint() {

	}

	public static ArrayList<Point> generatePoints() {
		ArrayList<Point> result = new ArrayList<Point>();
		for (int i = 0; i < 10_000; i++) {
			Point point = new Point();
			int x = (int) (Math.random() * 100_000);
			int y = (int) (Math.random() * 100_000);
			point.setLocation(x, y);
			result.add(point);
		}
		return result;
	}

	/*
	 * public static Map<Point, Point> getNearestPoints(LinkedList<Point>
	 * generatePoints){ Map<Point, Point> result = new HashMap<Point, Point>();
	 * double minDistance = 0; for (Point point1 : generatePoints){ Point
	 * nearPoint = new Point(); double distance = 100_000; for (Point point2 :
	 * generatePoints){ if (!(point1.equals(point2))){ int distanceX = (int)
	 * (point1.getX() - point2.getX()); int distanceY = (int) (point1.getY() -
	 * point2.getY()); minDistance = Math.sqrt(distanceX*distanceX +
	 * distanceY*distanceY); if (distance > minDistance){ distance =
	 * minDistance; nearPoint.setLocation(point2.getLocation()); } } }
	 * result.put(point1, nearPoint); } return result; }
	 */

	public static void doCalculations(ArrayList<Point> list, int indexFrom,
			int indexTo, Map<Point, Point> map) {
		double minDistance = 0;
		for (int i = indexFrom; i < indexTo; i++) {
			Point nearPoint = new Point();
			double distance = 100_000;
			for (int j = indexFrom; j < indexTo; j++) {
				if (i != j) {
					int distanceX = (int) (list.get(i).getX() - list.get(j).getX());
					int distanceY = (int) (list.get(i).getY() - list.get(j).getY());
					minDistance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
					if (distance > minDistance) {
						distance = minDistance;
						nearPoint.setLocation(list.get(j).getLocation());
					}
				}
			}
			map.put(list.get(i), nearPoint);
		}
	}

	public static Map<Point, Point> getNearest(final ArrayList<Point> list) {
		final Map<Point, Point> map = Collections.synchronizedMap(new HashMap<Point, Point>());

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				doCalculations(list, 0, list.size() / 6, map);
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				doCalculations(list, list.size() / 6, (2 * list.size()) / 6,
						map);

			}

		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				doCalculations(list, (2 * list.size()) / 6,
						(3 * list.size()) / 6, map);

			}

		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				doCalculations(list, (3 * list.size()) / 6,
						(4 * list.size()) / 6, map);

			}

		});

		Thread t5 = new Thread(new Runnable() {

			@Override
			public void run() {
				doCalculations(list, (4 * list.size()) / 6,
						(5 * list.size()) / 6, map);

			}

		});

		Thread t6 = new Thread(new Runnable() {

			@Override
			public void run() {
				doCalculations(list, (5 * list.size()) / 6, list.size(), map);

			}

		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return map;
	}

	public static void main(String[] args) {
		// for (Point point : MinimalPoint.generatePoints()){
		// System.out.println(point);
		// }

		// Map<Point, Point> nearestPoints =
		// MinimalPoint.do(MinimalPoint.generatePoints());
		// for (Point pointsKey : nearestPoints.keySet()){
		// System.out.println(pointsKey + " = " + nearestPoints.get(pointsKey));
		// }

		long startTime = System.currentTimeMillis();
		getNearest(MinimalPoint.generatePoints());
		long endTime = System.currentTimeMillis();
		System.out.println("Time:" + (endTime - startTime));
	}
}
