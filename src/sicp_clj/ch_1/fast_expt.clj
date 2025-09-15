(ns sicp-clj.ch-1.fast-expt)

(defn square [x]
  (* x x))

(defn fast-expt [b n]
  (cond (= n 0) 1
        (even? n) (square (fast-expt b (/ n 2)))
        :else (* b (fast-expt b (- n 1)))))

(defn fast-expt-1 [b n]
  (defn iter [a b n]
    (cond (= n 0) a
          (even? n) (iter a (square b) (/ n 2))
          :else (iter (* a b) b (- n 1))))
  (iter 1 b n))
