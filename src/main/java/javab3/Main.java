package javab3;

import static spark.Spark.*;


public class Main {
	static boolean CheckNT(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static String Show(int n) {
		String a = "";
		for (int i = 0; i < n; i++) {
			if (CheckNT(i)) {
				a += i + " ";
			}
		}
		return a;
	}

	public static void main(String[] args) {

		get("/hello/:id", (req, res) -> {
			int id = Integer.parseInt(req.params(":id"));
			return Show(id);
		});
	}

}
