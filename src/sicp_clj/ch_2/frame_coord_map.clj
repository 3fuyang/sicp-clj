(ns sicp-clj.ch-2.frame-coord-map)

(declare add-vect scale-vect xcor-vect ycor-vect origin-frame edge1-frame edge2-frame)

(defn frame-coord-map [frame]
  (fn [v]
    (add-vect (origin-frame frame)
              (add-vect (scale-vect (xcor-vect v) (edge1-frame frame))
                        (scale-vect (ycor-vect v) (edge2-frame frame))))))
