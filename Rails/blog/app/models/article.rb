class Article < ActiveRecord::Base
	belongs_to :category
	has_many :comments

	validates :title, presence: { message: "Le titre doit être renseigné." }
	validates :content, presence: { message: "L'article doit avoir du contenu." }
	validates :title, uniqueness: { message: "Ce titre est déjà pris." }
end