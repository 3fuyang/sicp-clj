(ns sicp-clj.ch-1.half-interval)

(defn average [a b]
  (/ (+ a b) 2.0))

(defn close-enough? [a b]
  (< (abs (- a b)) 0.001))

(defn search [f neg-point pos-point]
  (let [midpoint
        (average neg-point pos-point)]
    (if (close-enough? neg-point pos-point)
      midpoint
      (let [test-value (f midpoint)]
        (cond (pos? test-value) (search f neg-point midpoint)
              (neg? test-value) (search f midpoint pos-point)
              :else midpoint)))))

(defn half-interval-method [f a b]
  (let [a-value (f a)
        b-value (f b)]
    (cond (and (neg? a-value)
               (pos? b-value))
          (search f a b)
          (and (pos? a-value)
               (neg? b-value))
          (search f b a)
          :else (throw (IllegalArgumentException. "Values are not of opposite sign")))))

(half-interval-method
 (fn [x] (- (* x x x) (* 2 x) 3))
 1.0
 2.0)
