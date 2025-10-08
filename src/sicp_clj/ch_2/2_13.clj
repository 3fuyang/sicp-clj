(ns sicp-clj.ch-2.2-13
  (:require [sicp-clj.ch-2.2-11 :refer [mul-interval]]
   [sicp-clj.ch-2.2-12 :refer [percent, make-center-percent]]))

(defn appr-percent-of-product [a b]
  (let [p_a (percent a)
        p_b (percent b)]
    (+ p_a p_b)))

(def i (make-center-percent 30 1))
(def j (make-center-percent 25 3))
(def product (mul-interval i j))

(print (percent product))
(print (appr-percent-of-product i j))
