(ns sicp-clj.utils.pair)

(defn my-cons "see https://www.sicpdistilled.com/section/2-nothing" [x y]
  (fn [m]
    (cond (= m 0) x
          (= m 1) y)))

(defn car [z]
  (z 0))

(defn cdr [z]
  (z 1))
