(ns sicp-clj.ch-1.deriv
  (:require [sicp-clj.ch-1.sum :refer [cube]]))

(def dx 0.00001)

(defn deriv [g]
  (fn [x]
    (/ (- (g (+ x dx)) (g x)) dx)))

((deriv cube) 5)
