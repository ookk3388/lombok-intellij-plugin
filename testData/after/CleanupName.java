// Generated by delombok at Sat Jun 11 11:12:44 CEST 2016

class CleanupName {
	void test() {
		Object o = "Hello World!";
		try {
			System.out.println(o);
		} finally {
			if (java.util.Collections.singletonList(o).get(0) != null) {
				o.toString();
			}
		}
	}

	void test2() {
		Object o = "Hello World too!";
		try {
			System.out.println(o);
		} finally {
			if (java.util.Collections.singletonList(o).get(0) != null) {
				o.toString();
			}
		}
	}
}
