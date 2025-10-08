(ns sicp-clj.ch-2.2-11
  (:require [sicp-clj.ch-2.2-7 :refer [make-interval, upper-bound, lower-bound]]))

(defn mul-interval [x y]
  (let [x_u (upper-bound x)
        x_l (lower-bound x)
        y_u (upper-bound y)
        y_l (lower-bound y)]
    (cond (pos? x_l) ;; positive interval
          (cond (pos? y_l) (make-interval (* x_l y_l) (* x_u y_u))
                (neg? y_u) (make-interval (* x_u y_l) (* x_l y_u))
                :else (make-interval (* x_u y_l) (* x_u y_u)))
          (neg? x_u) ;; negative interval
          (cond (pos? y_l) (make-interval (* x_l y_u) (* x_u y_l))
                (neg? y_u) (make-interval (* x_u y_u) (* x_l y_l))
                :else (make-interval (* x_l y_u) (* x_l y_l)))
          :else ;; spanning-zero interval
          (cond (pos? y_l) (make-interval (* x_l y_u) (* x_u y_u))
                (neg? y_u) (make-interval (* x_u y_l) (* x_l y_l))
                :else (make-interval (min (* x_l y_u) (* x_u y_l))
                                     (max (* x_l y_l) (* x_u y_u)))))))
