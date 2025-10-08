(ns sicp-clj.ch-2.2-14
  (:require [sicp-clj.ch-2.2-7 :refer [make-interval, add-interval]]
            [sicp-clj.ch-2.2-10 :refer [div-interval]]
            [sicp-clj.ch-2.2-11 :refer [mul-interval]]
            [sicp-clj.ch-2.2-12 :refer [make-center-percent, percent, center]]))

(defn par1 [r1 r2]
 (div-interval
  (mul-interval r1 r2)
  (add-interval r1 r2)))

(defn par2 [r1 r2]
  (let [one (make-interval 1 1)]
    (div-interval
     one
     (add-interval
      (div-interval one r1)
      (div-interval one r2)))))


(def r1 (make-center-percent 1000 5))
(def r2 (make-center-percent 500 10))
(def par1-result (par1 r1 r2))
(def par2-result (par2 r1 r2))
(println (center par1-result))
(println (center par2-result))
(println (percent par1-result))
(println (percent par2-result))

(println (center (div-interval r1 r1)))
(println (percent (div-interval r1 r1)))
(println (center (div-interval r1 r2)))
(println (percent (div-interval r1 r2)))
