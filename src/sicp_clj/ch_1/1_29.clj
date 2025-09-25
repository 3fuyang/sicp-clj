(ns sicp-clj.ch-1.1-29 
  (:require
    [sicp-clj.ch-1.sum :as sum]))

(defn simpson-integral "n must be even" [f a b n] 
  (defn simpson-add [h]
    (defn simpson-unit [k]
      (let [y (f (+ a (* k h)))]
        (cond
          (or (= 0 k) (= n k)) y
          (even? k) (* 2 y)
          :else (* 4 y))))
      (sum/sum simpson-unit 0 inc n))
  (defn start [h]
    (* (/ h 3.0) (simpson-add h)))
  (start (/ (- b a) n)))

(simpson-integral sum/cube 0 1.0 100)
;; 0.24999999999999992
;; (simpson-integral sum/cube 0 1.0 1000)
;; 0.2500000000000003
