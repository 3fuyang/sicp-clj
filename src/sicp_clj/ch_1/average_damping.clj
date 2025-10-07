(ns sicp-clj.ch-1.average-damping
  (:require [sicp-clj.ch-1.sqrt :refer [average square]]
            [sicp-clj.ch-1.fixed-point :refer [fixed-point]]))

;; a procedure that takes a procedure as argument
;; and returns a procedure as value
(defn average-damp [f]
  (fn [x]
    (average x (f x))))

(defn cube-root [x]
  (fixed-point
   (average-damp
    (fn [y]
      (/ x (square y))))
   1.0))
