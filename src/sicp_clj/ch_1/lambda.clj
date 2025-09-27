(ns sicp-clj.ch-1.lambda)

(defn f [x y]
  (let [a (+ 1 (* x y))
        b (- 1 y)]
    (+ (* x (* a a))
       (* y b)
       (* a b))))
