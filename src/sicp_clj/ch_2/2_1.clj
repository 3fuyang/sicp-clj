(ns sicp-clj.ch-2.2-1
  (:require [sicp-clj.ch-1.gcd :refer [gcd]]
            [sicp-clj.utils.pair :refer [my-cons]]
            [sicp-clj.ch-2.rat :refer [print-rat]]))

(defn make-rat [n d]
  (defn neg-rat? [n d]
    (or (and (neg? n) (pos? d))
        (and (pos? n) (neg? d))))
  (let [g (gcd n d) x (abs (/ n g))]
    (my-cons (if (neg-rat? n d)
               (- x)
               x)
             (abs (/ d g)))))

(def minus-one-half (make-rat 2 -4))
(print-rat minus-one-half)
