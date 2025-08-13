(ns sicp-clj.ch-1.inc-dec)

(defn plus [a b]
  (if (= a 0)
    b
    (inc (plus (dec a) b))))

(defn plus_ [a b]
  (if (= a 0)
    b
    (plus_ (dec a) (inc b))))
