(ns sicp-clj.ch-2.count-leaves
  (:require [sicp-clj.utils.pair :refer [car, cdr, my-cons]]))

(defn pair? "a mimic of pair? in scheme" [x]
  (fn? x))

(defn count-leaves [x]
  (cond (not (pair? x)) 1
        :else (+ (count-leaves (car x))
                 (count-leaves (cdr x)))))

(def x (my-cons (my-cons 1 2) (my-cons 3 4)))
(println (count-leaves x))
(println (count-leaves (my-cons x x)))
