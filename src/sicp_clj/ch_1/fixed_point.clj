(ns sicp-clj.ch-1.fixed-point)
(require '[clojure.math :as math])

(def tolerance 0.00001)

(defn fixed-point [f first-guess]
  (defn close-enough? [v1 v2]
    (< (abs (- v1 v2)) tolerance))
  (defn try-g [guess]
    (let [next (f guess)]
      (if (close-enough? guess next)
        guess
        (try-g next))))
  (try-g first-guess))

(fixed-point math/cos 1.0)
;; (fixed-point (fn [y] (+ (math/sin y) (math/cos y))) 1.0)

(defn sqrt [x]
  (defn average [a b]
    (/ (+ a b) 2))
  (fixed-point
   (fn [y] (average y (/ x y)))
   1.0))
